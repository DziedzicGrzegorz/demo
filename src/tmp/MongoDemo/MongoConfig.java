//package com.example.demo.MongoDemo;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//
//@Configuration
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//
//    @Override
//    protected String getDatabaseName() {
//        return "test";
//    }
//
//    @Override
//    public MongoClient mongoClient() {
//        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/test");
//        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//
//        return MongoClients.create(mongoClientSettings);
//    }
//
//    @Override
//    public Collection getMappingBasePackages() {
//        return Collections.singleton("com.baeldung");
//    }
//}