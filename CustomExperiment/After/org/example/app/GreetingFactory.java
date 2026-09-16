package org.example.app;

class GreetingFactory {

    // Suppressed since buildGreeting() is deliberately called from Greeter's static
    // initializer; @DoNotCall would make that call site an error too.
    @SuppressWarnings("DoNotCallSuggester")
    static String buildGreeting() {
        throw new java.lang.Error();
    }
}
