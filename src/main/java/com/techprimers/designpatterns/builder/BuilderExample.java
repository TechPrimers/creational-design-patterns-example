package com.techprimers.designpatterns.builder;

public class BuilderExample {

    public static void main(String[] args) {

        Phone.Builder builder = new Phone.Builder()
                .backPanel("Sandstone")
                .frontPanel("AMOLED")
                .camera("12 MP")
                .processor("Snapdragon 625");

        Phone phone = builder.build();

        System.out.println(phone);
        /*
        1. String Builder
        2. Document Builder
        3. Locale.Builder
        4. Spring Reactive
        5. MockMvcBuilders
         */
    }

}
