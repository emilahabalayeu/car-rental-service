package com.solvd.carrental;

import com.solvd.carrental.annotations.RentalInfo;

import java.lang.reflect.*;

public class ReflectionService {

    public void printClassInfo(Class<?> clazz) {
        System.out.println("\n=== Reflection info for: " + clazz.getSimpleName() + " ===");

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("Constructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println("  " + constructor.getName() + " params: " + constructor.getParameterCount());
        }

        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getSimpleName() + " " + method.getName());
        }

        if (clazz.isAnnotationPresent(RentalInfo.class)) {
            RentalInfo annotation = clazz.getAnnotation(RentalInfo.class);
            System.out.println("Annotation @RentalInfo: description=" + annotation.description() + ", author=" + annotation.author());
        }
    }

    public void createObjectAndCallMethod() {
        try {
            Class<?> clazz = Class.forName("com.solvd.carrental.client.Client");
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
            Object client = constructor.newInstance("John", "Doe", "Individual");
            Method method = clazz.getDeclaredMethod("getRole");
            Object result = method.invoke(client);
            System.out.println("Created object via reflection, getRole() = " + result);
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}