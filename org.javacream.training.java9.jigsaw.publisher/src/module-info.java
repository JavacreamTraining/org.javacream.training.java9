import org.javacream.training.java9.jigsaw.publisher.StringSubscriber;

/**
 * 
 */
/**
 * @author Administrator
 *
 */
module org.javacream.training.java9.jigsaw.publisher {
	exports org.javacream.training.java9.jigsaw.publisher;
	exports org.javacream.training.java9.jigsaw.publisher.impl to org.javacream.training.java9.jigsaw.application;
	uses StringSubscriber;
}