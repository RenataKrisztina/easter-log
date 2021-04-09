package pkg;

import org.apache.logging.log4j.*;



public class Main {

    private static final Logger logger = LogManager.getLogger();

    private static final Marker QUESTION_MARKER = MarkerManager.getMarker("question");
    private static final Marker STATEMENT_MARKER = MarkerManager.getMarker("statement");

    public static void main(String[] args) throws InterruptedException {

        int iteration = Integer.parseInt(args[0]);
        //int iteration = 3;
        for( int j = 1; j <= iteration; j++){
            //ThreadContext.put()
            ThreadContext.push(String.valueOf(j));
            logger.fatal(STATEMENT_MARKER, "Én kis kertészlegény vagyok");
            logger.error(STATEMENT_MARKER, "Locsolkodni járogatok...");
            logger.warn(STATEMENT_MARKER,"Azt hallottam, hogy egy rózsa");
            logger.fatal(STATEMENT_MARKER,"El akar hervadni.");
            logger.debug("Megkérdem az apját, anyját:");
            logger.info(QUESTION_MARKER,"Szabad-e locsolni a lányát?");
            Thread.sleep(3000);
            ThreadContext.pop();
        }

    }

}
