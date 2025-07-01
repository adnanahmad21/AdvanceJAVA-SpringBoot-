package org.example;

public class Car {
    Engine engine;
    public Car()
    {
        System.out.println("This is Car constructor");
    }
    public Car(Engine engine){
            this.engine=engine;

        }
            public void setEngine (Engine engine){
            System.out.println("Calling Setter Method");
            this.engine = engine;
        }

            void drive ()
            {
                if (engine.start() == 1) System.out.println("Car Started");
                else System.out.println("Car not started");
            }

        }
