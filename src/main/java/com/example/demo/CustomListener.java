package com.example.demo;

import com.example.demo.antlrfiles.QueryBaseListener;
import com.example.demo.antlrfiles.QueryParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomListener extends QueryBaseListener{

    Map<String, String> keyValuePairsMap = new HashMap<>();
    List<String> propertyList = new ArrayList<>();

    @Override
    public void enterQuery(QueryParser.QueryContext ctx) {
        extractKeyValuePairs(ctx);
        extractPropertyList(ctx);

    }

    public Map<String, String> getKeyValuePairs() {
        return keyValuePairsMap;
    }

    public List<String> gettingPropertyList(){
        return propertyList;
    }

    public void extractKeyValuePairs(QueryParser.QueryContext ctx) {
        for (QueryParser.KeyValuePairContext kvpContext : ctx.keyValuePairs().keyValuePair()) {
            String key = kvpContext.key().getText();
            String value = kvpContext.value().getText(); // Since all values are strings, getText() suffices
            keyValuePairsMap.put(key, value);
        }
    }

    public void extractPropertyList(QueryParser.QueryContext ctx) {
        for (QueryParser.PropertyContext pc : ctx.propertyList().property()) {
            propertyList.add(pc.getText());
        }
    }

}
