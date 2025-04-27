package com.codefinity;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Resource resource;  // Ресурс, до якого потік буде звертатися
    private final Semaphore semaphore; // Семафор для контролю доступу до ресурсу

    // Конструктор, який ініціалізує ресурс і семафор
    public Worker(Resource resource, Semaphore semaphore) {
        this.resource = resource;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            // Потік намагається отримати дозвіл на доступ до ресурсу
            semaphore.acquire(); // Очікує на дозвіл від семафора (блокує потік, поки не з'явиться дозвіл)

            // Якщо дозвіл отримано, потік використовує ресурс
            resource.use(); // Викликає метод use() для роботи з ресурсом
        } catch (InterruptedException e) {
            // Якщо потік був перерваний, відновлюємо статус переривання
            Thread.currentThread().interrupt();
        } finally {
            // Після використання ресурсу потік звільняє дозвіл на використання ресурсу
            semaphore.release(); // Звільняє дозвіл, дозволяючи іншому потоку доступити ресурс
        }
    }
}
