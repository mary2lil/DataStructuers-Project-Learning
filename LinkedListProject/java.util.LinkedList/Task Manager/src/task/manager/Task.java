/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task.manager;

/**
 *
 * @author HP
 */
public class Task {
    private String name ;
    private boolean comletion_status;
    private String implementation_date;

    public Task() {
    }

    public Task(String name, boolean comletion_status, String implementation_date) {
        this.name = name;
        this.comletion_status = comletion_status;
        this.implementation_date = implementation_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComletion_status() {
        return comletion_status;
    }

    public void setComletion_status(boolean comletion_status) {
        this.comletion_status = comletion_status;
    }

    public String getImplementation_date() {
        return implementation_date;
    }

    public void setImplementation_date(String implementation_date) {
        this.implementation_date = implementation_date;
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", comletion_status=" + comletion_status + ", implementation_date=" + implementation_date + '}';
    }
}
