# IT21 Activity 3 – Polymorphism and Abstraction

## Program Descriptions

### 1. ACTIVITY1_soco.java
This program is a basic Java activity nga nag-practice sa paggamit sa Java code, variables, ug instructions. It helps us understand how a Java program works and how to execute basic programming tasks.

### 2. PolymorphismDemo.java
This program demonstrates **polymorphism** pinaagi sa inheritance ug method overriding. Ang parent class adunay method nga ma-inherit sa child classes, pero ang child classes pwede mag-change sa behavior sa method based sa ilang own implementation.

- **Parent class:** Mao ang main or base class nga nag-provide sa original method.
- **Child classes:** Mga class nga nag-inherit gikan sa parent class.
- **Overridden method:** Method nga gi-redefine sa child class para maghatag ug lahi nga behavior.

### 3. AbstractionDemo.java
This program demonstrates **abstraction** pinaagi sa paggamit ug abstract class ug abstract method. Ang abstract class serves as a blueprint, while ang child class maoy mo-provide sa actual implementation sa abstract method.

- **Abstract class:** A class nga nagsilbing blueprint sa iyang child classes.
- **Abstract method:** Method nga declaration pa lang, wala pa siyay complete code or implementation.
- **Implementation:** Mao ang actual code nga gibutang sa child class para ma-complete ang abstract method.

---

## Polymorphism

Polymorphism means "many forms." Sa Java, it allows different classes to use the same method name pero lahi-lahi ang ilang behavior.

Through method overriding, ang child class pwede maghatag ug sariling implementation sa method nga gikan sa parent class. This makes the program more flexible because one method can perform different actions depending on the object.

## Abstraction

Abstraction means hiding unnecessary details and showing only the important features. Sa Java, mahimo ni pinaagi sa abstract class ug abstract method.

Ang abstract class dili pwede himoan ug object directly. Instead, ang child class maoy mo-extend niini ug mo-implement sa abstract methods para magamit ang functionality.

## Difference Between Polymorphism and Abstraction

Ang **polymorphism** focuses on different behaviors using the same method, while ang **abstraction** focuses on hiding unnecessary details and providing a blueprint for other classes.

In simple terms, polymorphism allows one method to have different behaviors, while abstraction helps simplify the code by showing only the important parts.

---

## Reflection Questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding is important because it allows the child class to have its own behavior sa method nga gikan sa parent class. This makes the program flexible and allows different objects to perform different actions using the same method name.

If dili i-override sa child class ang parent's method, it will simply use the inherited method from the parent class. Pero if abstract ang method, kinahanglan i-implement sa child class unless abstract gihapon ang child class.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

Dili ta makahimo ug object directly from an abstract class because it may contain methods nga wala pa complete ang implementation. The purpose of this restriction is to make sure nga ang child class mo-provide sa needed implementation before creating an object.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

If mag-add ko ug another child class, I can simply extend the parent class and override the same method. My existing program can still handle it because the new child class can use the same method call but produce a different behavior. This makes my code easier to expand without changing the entire program.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, polymorphism and abstraction can work together in one program. Abstraction provides a common blueprint through an abstract class, while polymorphism allows different child classes to have their own implementation of the same method.

For example, naa koy abstract class nga `Animal` with an abstract method `makeSound()`. Ang child classes nga `Dog` ug `Cat` mo-implement sa `makeSound()` differently. Ang Dog mo-bark, while ang Cat mo-meow. Same method, pero different behavior depending on the object. This shows how abstraction and polymorphism work together.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

As a future programmer, I would use polymorphism if I want different objects to perform the same method but with different behaviors. It helps make my code flexible and easier to expand.

I would use abstraction if I want to create a blueprint for related classes and hide unnecessary details. It helps me organize my code and focus only on the important functions.

Both are useful in programming because they help make the code more organized, reusable, and easier to maintain.
