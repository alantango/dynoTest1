package org.aws.test;

import java.util.List;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " >>> Test starts..." );

        AmazonDynamoDBClientBuilder dbBuilder = AmazonDynamoDBClientBuilder.standard();
        AmazonDynamoDB ddb = dbBuilder.build();
        
        ListTablesResult resp = ddb.listTables();

        List<String> tableNames = resp.getTableNames();
        System.out.println("List tables (v1):");

        for(String table : tableNames){
            System.out.println(table);
        }

    }
}
