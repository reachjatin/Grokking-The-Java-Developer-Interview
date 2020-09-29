package com.externalizable.demo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Department implements Externalizable {
	private int deptId;
	private String deptName;
	private int capacity;
	
	public Department() {
		System.out.println("No-arg constructor of Department class");
	}
	public void setDeptId(int deptId) { this.deptId = deptId; }
	public void setDeptName(String deptName) { this.deptName = deptName; }
	public void setCapacity(int capacity) {	this.capacity = capacity; }

	public int getDeptId() { return deptId; }
	public String getDeptName() { return deptName; }
	public int getCapacity() { return capacity; }
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", capacity=" + capacity + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(deptId);
		out.writeUTF(deptName);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		deptId = in.readInt();
		deptName = in.readUTF();
	}
}