package edu.rylynn.crawler.pipeline;

import org.apache.log4j.Logger;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.File;
import java.util.Map;

public class NeoPipeline implements Pipeline {

    private static final Logger logger = Logger.getLogger(NeoPipeline.class);
    private GraphDatabaseService graph;

    public NeoPipeline() {

        graph = new GraphDatabaseFactory().newEmbeddedDatabase(new File("/usr/local/Cellar/neo4j/3.5.0/libexec/data/databases"));

    }


    @Override
    public void process(ResultItems resultItems, Task task) {
        Map<String, String> basicInfo = resultItems.get("basicInfo");
       // basicInfo.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    enum MyLabel implements Label {

    }

    enum MyRealationshipType implements RelationshipType {

    }
}
