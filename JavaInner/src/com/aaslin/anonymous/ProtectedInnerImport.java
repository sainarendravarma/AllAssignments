package com.aaslin.anonymous;
import com.aaslin.local.Task2_varma12_Protected;
public class ProtectedInnerImport extends Task2_varma12_Protected{
public static void main(String args[]) {
	Task2_varma12_Protected pro_in = new Task2_varma12_Protected();
	Task2_varma12_Protected.ProtectedInnerClass inner = pro_in.new ProtectedInnerClass();
	inner.method3();
}
}
