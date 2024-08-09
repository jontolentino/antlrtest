grammar Query;

// The entry point for the parser
query: 'FROM' ID '(' keyValuePairs ')' 'SELECT' propertyList 'ADD'? ';'? EOF;


// Property list, with properties separated by commas
propertyList: property (',' property)*;

// A property can be any valid identifier
property: ID;


// KeyValuePairs can be one or more key=value pairs separated by commas
keyValuePairs: keyValuePair (',' keyValuePair)* ;

// A single key=value pair, allowing for quoted values
keyValuePair: key '=' value ;

// Key, e.g., firstName, lastName
key: ID ;

// Value, allowing for quoted strings
value: ID | NULL;

NULL: 'null';

// Define the ID as a sequence of letters, digits, and underscores
ID: [a-zA-Z_][a-zA-Z_0-9]* | NUMBER;

NUMBER: [0-9]+ ('.' [0-9]+)?;

// Skip whitespace
WS: [ \t\r\n]+ -> skip;