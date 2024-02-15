package example;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.PrintWriter;

import static org.junit.platform.launcher.TagFilter.includeTags;

public class runner {

    public static void main(String[] args) {
        if (args.length > 0) {
            runTests(args[0]);
        } else {
            System.err.println("Please provide a tag as an argument.");
        }
    }

    public static void runTests(String tag) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectPackage("example"))
                .filters(includeTags(tag))
                .build();

        Launcher launcher = LauncherFactory.create();

        // Create a SummaryGeneratingListener
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        // Register the listener with the launcher
        launcher.registerTestExecutionListeners(listener);

        TestPlan testPlan = launcher.discover(request);
        launcher.execute(testPlan);

        // Print the summary to the console
        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out, true));
    }
}