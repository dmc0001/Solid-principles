## Open-Closed
 
   As the name suggests, this principle states that software entities should be open for extension,
but closed for modification. As a result, when the business requirements change then the entity can be extended, 
but not modified.



- Changing : the current behaviour of a Class will affect all the systems using that Class
- Adding : If you want the Class to perform more functions, the ideal approach is to add to the functions that already exist NOT change them.

 > all of those achive This aims to extend a Class’s behaviour without changing the existing behaviour of that Class. This is to avoid causing bugs wherever the Class is being used.
 
![](https://miro.medium.com/max/828/1*0MtFBmm6L2WVM04qCJOZPQ.png)

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
