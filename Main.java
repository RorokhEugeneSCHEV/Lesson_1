class Animal {
    private String name;
    private static int totalCount = 0;
    
    public Animal(String name) {
        this.name = name;
        totalCount++;
    }
    
    public void run(int distance) {
        System.out.println(name + " бежит " + distance);
    }
    
    public void swim(int distance) {
        System.out.println(name + " плывет " + distance);
    }
    
    public String getName() {
        return name;
    }
    
    public static int getTotalCount() {
        return totalCount;
    }
}


class Bowl {
    private int foodAmount;
    
    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    

    public boolean getFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            System.out.println("Взято " + amount + " еды из миски. Осталось: " + foodAmount);
            return true;
        } else {
            System.out.println("Недостаточно еды! Нужно: " + amount + ", есть: " + foodAmount);
            return false;
        }
    }
    

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("Добавлено " + amount + " еды в миску. Теперь: " + foodAmount);
    }
    
    public int getFoodAmount() {
        return foodAmount;
    }
}


class Dog extends Animal {
    private static int dogCount = 0;
    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(getName() + " пробежал " + distance);
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " максимум " + MAX_RUN);
        }
    }
    
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(getName() + " проплыл " + distance);
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " максимум " + MAX_SWIM);
        }
    }
    
    public static int getDogCount() {
        return dogCount;
    }
}


class Cat extends Animal {
    private static int catCount = 0;
    private final int MAX_RUN = 200;
    private boolean isFull; 
    private final int FOOD_NEEDED = 15; 
    
    public Cat(String name) {
        super(name);
        this.isFull = false; 
        catCount++;
    }
    
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(getName() + " пробежал " + distance);
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " максимум " + MAX_RUN);
        }
    }
    
    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать!");
    }
    

    public void eat(Bowl bowl) {
        if (bowl.getFood(FOOD_NEEDED)) {
            isFull = true;
            System.out.println(getName() + " поел и сыт!");
        } else {
            System.out.println(getName() + "  Не хватило еды.");
        }
    }
    
    public boolean isFull() {
        return isFull;
    }
    
    public static int getCatCount() {
        return catCount;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Наши животные");



        Dog dog1 = new Dog("Фреди");
        Dog dog2 = new Dog("Бимка");
        Cat cat1 = new Cat("Ферзь");
        Cat cat2 = new Cat("Мелисса");
        Cat cat3 = new Cat("Маня");
        

        dog1.run(300);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(15);
        
        cat1.run(150);
        cat1.run(250);
        cat1.swim(10);
        
        System.out.println("Кормим котов");
        

        Bowl bowl = new Bowl(40);
        System.out.println("В миске сейчас: " + bowl.getFoodAmount() + " еды");
        

        Cat[] cats = {cat1, cat2, cat3};
        

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        

        System.out.println("Сытость котов");
        for (Cat cat : cats) {
            String status = cat.isFull() ? "сыт" : "голоден";
            System.out.println(cat.getName() + " - " + status);
        }

        

     
        System.out.println("Итог ____");
        System.out.println("Всего животных: " + Animal.getTotalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Еды осталось в миске: " + bowl.getFoodAmount());
    }
}
