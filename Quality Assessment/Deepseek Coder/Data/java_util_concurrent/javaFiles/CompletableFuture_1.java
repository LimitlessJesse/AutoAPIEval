CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    // Task to be performed asynchronously
    System.out.println("Running asynchronously");
});

future.join();  // This will make the main thread wait for the asynchronous task to complete
