## Liskov-Substitution
 
  If for each object <b>o1</b> of type <i>S</i> there is an object <b>o2</b> of type <i>T</i> such that for all programs <i>P</i> defined in terms of <i>T</i>, the behavior of P is unchanged when <b>o1</b> is substituted for <b>o2</b> then <i>S</i> is a subtype of <i>T</i>.


## When Is a Subtype Substitutable for Its Supertype ?

A subtype doesn't automatically become substitutable for its supertype. To be substitutable, the subtype must behave like its supertype.

An object's behavior is the contract that its clients can rely on. The behavior is specified by the public methods, any constraints placed on their inputs, any state changes that the object goes through, and the side effects from the execution of methods.

Subtyping in Java requires the base class's properties and methods are available in the subclass.

However, behavioral subtyping means that not only does a subtype provide all of the methods in the supertype, but it must adhere to the behavioral specification of the supertype. This ensures that any assumptions made by the clients about the supertype behavior are met by the subtype.
- <b>Method Argument Types :</b> This rule states that the overridden subtype method argument types can be identical or wider than the supertype method argument types.

- <b>Return Types :</b> The return type of the overridden subtype method can be narrower than the return type of the supertype method. 

![](https://miro.medium.com/max/828/1*yKk2XKJaCLNlDxQMx1r55Q.png)
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
