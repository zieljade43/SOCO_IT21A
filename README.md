IT21 Activity 3 – Polymorphism and Abstraction

 1. ACTIVITY1_soco.java

This program is a basic Java activity nga nag-practice sa paggamit sa Java code, variables, and instructions. It helps us understand how a Java program works and how to execute basic programming tasks.

 2. PolymorphismDemo.java

This program demonstrates polymorphism through inheritance and method overriding. Ang parent class adunay method nga ma-inherit sa child classes, pero ang child classes can override the method para maghatag ug different behavior depending sa ilang implementation.

 Parent class: Mao ang base class nga nag-provide sa original method nga ma-inherit sa child classes.
  Child classes: Mga classes nga nag-inherit sa properties and methods gikan sa parent class.
  Overridden method: Mao ang method nga gi-redefine sa child class para maghatag ug sariling behavior or output.

 3. AbstractionDemo.java

This program demonstrates abstraction through the use of an abstract class and abstract method. Ang abstract class serves as a blueprint, while ang child class maoy mo-provide sa actual implementation sa abstract method.

Abstract class: A class nga nagsilbing blueprint for its child classes.
Abstract method: A method nga declaration pa lang and wala pa siyay complete implementation.
Implementation: Mao ang actual code nga gibutang sa child class para ma-complete ang abstract method.

Polymorphism

Polymorphism means "many forms." In Java, it allows different classes to use the same method name pero different ang ilang behavior or output.


Through method overriding, ang child class can provide its own implementation sa method nga gikan sa parent class. This makes the program more flexible because the same method can perform different actions depending on which object is being used.

 Abstraction

Abstraction means hiding unnecessary details and showing only the important features of a program. In Java, mahimo ni through abstract classes and abstract methods.

Ang abstract class dili pwede himoan ug object directly because it may contain methods nga wala pa complete ang implementation. Instead, ang child class mo-extend sa abstract class and provide the implementation needed para magamit ang method.

Difference Between Polymorphism and Abstraction

Ang polymorphism focuses on different behaviors using the same method, while ang **abstraction** focuses on hiding unnecessary details and providing a blueprint for other classes.

In simple terms, polymorphism allows the same method to behave differently, while abstraction helps simplify the program by showing only the important parts and hiding how they work internally.

 Reflection Questions

 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding is important because it allows the child class to have its own behavior sa method nga inherited from the parent class. This makes the program more flexible because different objects can perform different actions using the same method name.

If dili i-override sa child class ang parent's method, it will use the inherited method from the parent class. Pero if abstract ang method, kinahanglan i-implement sa child class unless abstract gihapon ang child class.

 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

Dili ta makahimo ug object directly from an abstract class because it may contain methods nga wala pa complete ang implementation. The purpose of this restriction is to make sure nga ang child class mo-provide sa necessary implementation before creating an object. This helps avoid using incomplete functionality.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

If mag-add ko ug another child class, I can simply extend the parent class and override the same method. My existing program can still handle the new class because it can use the same method call but produce a different behavior. This makes my code easier to expand without changing the entire program.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, polymorphism and abstraction can work together in one program. Abstraction provides a common blueprint through an abstract class, while polymorphism allows different child classes to have their own implementation of the same method.

For example, naa koy abstract class nga Animal with an abstract method makeSound(). Ang child classes nga Dog and Cat will implement the makeSound() method differently. Ang Dog mo-bark, while ang Cat mo-meow. Same method, pero different behavior depending sa object. This shows how abstraction and polymorphism work together.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

As a future programmer, I would use polymorphism if I want different objects to perform the same method but with different behaviors. It helps make my code more flexible and easier to expand.

I would use abstraction if I want to create a blueprint for related classes and hide unnecessary details. It helps me organize my code and focus only on the important functions without showing all the implementation details.

Both concepts are useful in programming because they help make the code more organized, reusable, flexible, and easier to maintain.
