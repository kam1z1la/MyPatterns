package com.myprojects.patterns.structural.CoR;

public abstract class AssemblyLine {
    protected AssemblyLine assemblyLine;

    protected void setNext(AssemblyLine assemblyLine, Component  component) {
        this.assemblyLine = assemblyLine;
        this.assemblyLine.install(component);
    }

    abstract void install(Component  component);
}
