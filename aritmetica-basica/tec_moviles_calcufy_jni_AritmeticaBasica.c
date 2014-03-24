/*
 * tec_moviles_calcufy_AritmeticaBasica.c
 *
 *  Created on: Mar 23, 2014
 *      Author: emma
 */


#include <jni.h>
#include "../calcufy/bin/tec_moviles_calcufy_jni_AritmeticaBasica.h"
#include <stdio.h>

JNIEXPORT jdouble JNICALL Java_tec_moviles_calcufy_jni_AritmeticaBasica_sumar(JNIEnv *env, jobject obj, jdouble op1, jdouble op2)
{
 jdouble result = op1 + op2;
  return result;
}

JNIEXPORT jdouble JNICALL Java_tec_moviles_calcufy_jni_AritmeticaBasica_restar(JNIEnv *env, jobject obj, jdouble op1, jdouble op2)
{
 jdouble result = op1 - op2;
 return result;
}

JNIEXPORT jdouble JNICALL Java_tec_moviles_calcufy_jni_AritmeticaBasica_multiplicar(JNIEnv *env, jobject obj, jdouble op1, jdouble op2)
{
 jdouble result = op1 * op2;
  return result;
}

JNIEXPORT jdouble JNICALL Java_tec_moviles_calcufy_jni_AritmeticaBasica_dividir(JNIEnv *env, jobject obj, jdouble op1, jdouble op2)
{
 jdouble result = op1 / op2;
  return result;
}
