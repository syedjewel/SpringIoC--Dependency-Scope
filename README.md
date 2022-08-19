# SpringIoC--Dependency-Scope
SpringIoC- Dependency-Scope
# SpringIoC--Dependency-Scope
SpringIoC- Dependency-Scope
***** Dependency Injection (DI)**********

 The DI Principle is being able to pass (inject) the dependencies inside of the recipient class (Ex. ClassA).
Without initializing the ClassB in ClassA 

Initializing= new ()
inject=Don't use new (). 

*****Constructor Injection:************

recipient class (ClassA) using constructor injection taking help inharitance of Class 
without initializing the depended class (ClassB)

It can be easy to manage and test the application.
Dependency Injection makes our programming code loosely coupled

*********Inversion of Control (IOC)**********

Instance Creation by IOC for depended class (ClassB) for Injection to recipient class.

*******Spring IoC Container************
The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container. Spring framework provides two distinct types of containers.

1. BeanFactory container
2. ApplicationContext container

BeanFactory is the root interface of Spring IOC container. ApplicationContext is the child interface of BeanFactory interface that provides Spring AOP features, i18n etc.

Why use IoC Container:

1. after modifying the dependicies class, receipent class needed recompilation which very costly for maintain development and release 
2. this container maintain the object life cycle through bean scope.

Imagine an application with dozens or even hundreds of classes. Sometimes we want to share a single instance of a class across the whole application, other times we need a separate object for each use case, and so on.

Managing such a number of objects is nothing short of a nightmare. This is where inversion of control comes to the rescue.

Bean Scope:
time (When) and number object (How many) Creation in Container
Singletone: Only 1 instance of bean per spring container
Prototype: Create instance every time when bean is requested
Request: Single bean instance per HTTP Request
Session: Single bean instance per HTTP Session
Global Session: Single bean instance per global HTTP Session 
