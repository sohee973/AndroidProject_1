#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL
Java_com_example_demo_nativeInterface_HelloSpring_print(
JNIEnv *env, jobject obj){
printf("Hello Spring from C!\n");
return;}