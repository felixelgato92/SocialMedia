

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Felipe on 12/9/2015.
 */
public class TrueClassifier extends Experimenter{
    Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
                                                   Set<SocialMediaEntry> testSet) {

        System.out.println("Running classifier...");

        // In a real use case, build a machine learning model from the training set,
        // then use it to classify the entries in the test set.


        Map<SocialMediaEntry, Boolean> results = new HashMap<SocialMediaEntry, Boolean>();

        // Right now this is putting a "true" for everything
        // TODO: This method will need to be changes / replaced.
        for (SocialMediaEntry entry : testSet) {
            results.put(entry, true);
        }

        return results;
    }
}
