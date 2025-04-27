package com.codefinity;

public class Resource {

    // Метод use() імітує використання ресурсу
    public void use() {
       // Виводимо повідомлення про те, що потік використовує ресурс
       System.out.println(Thread.currentThread().getName() + " is using the resource.");
       
       try {
            // Імітуємо затримку (робота з ресурсом), щоб інші потоки могли спробувати використати ресурс
            Thread.sleep(1000); // Потік чекає 1 секунду (1000 мс)
       } catch (InterruptedException e) {
            // Якщо потік перерваний, відновлюємо статус переривання
            Thread.currentThread().interrupt();
       }

       // Виводимо повідомлення про те, що потік завершив використання ресурсу
       System.out.println(Thread.currentThread().getName() + " has finished using the resource.");
    }
}
