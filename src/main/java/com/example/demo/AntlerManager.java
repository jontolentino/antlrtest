package com.example.demo;

import com.example.demo.antlrfiles.QueryLexer;
import com.example.demo.antlrfiles.QueryParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AntlerManager {

    Map<String, Object> mappedQuery = new HashMap<>();

    public Map<String, Object> send(String eventString) {
        try {
            CharStream input = CharStreams.fromString(eventString); // Replace yourInputString with your actual input
            QueryLexer lexer = new QueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            QueryParser parser = new QueryParser(tokens);
            ParseTree tree = parser.query();

            // Create the listener and walk the parse tree
            CustomListener listener = new CustomListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);

            // Get the extracted properties
            Map<String, String> keyValuePairs = listener.getKeyValuePairs();
            List<String> properties = listener.gettingPropertyList();
            System.out.println(keyValuePairs);
            System.out.println(properties);

            for (String property : properties) {
                if (keyValuePairs.containsKey(property)) {
                    mappedQuery.put(property, keyValuePairs.get(property));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mappedQuery;
    }
}
