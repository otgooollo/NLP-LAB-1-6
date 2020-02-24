package nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SentenceRun {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(SentenceRun.class);
        logger.info("Sentence Logger Started");

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String txt = "hello!! teacher Im Otgonbayar. My lesson started.";

        CoreDocument doc = new CoreDocument(txt);
        stanfordCoreNLP.annotate(doc);

        List<CoreSentence> sens = doc.sentences();
        for(CoreSentence sen : sens){
            System.out.println(sen.toString());
        }
    }
}
