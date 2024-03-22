package com.aaslin.anonymous;
import com.aaslin.local.*;
import com.aaslin.local.OuterClass2.DefaultInnerClass;
public class DefaultInnerImport {
public static void main(String args[]) {
	OuterClass2 outerdef = new OuterClass2();
	OuterClass2.DefaultInnerClass default_in1 = outerdef.new DefaultInnerClass();
	default_in1.method4();
}
}
