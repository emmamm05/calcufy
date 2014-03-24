################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../tec_moviles_calcufy_AritmeticaBasica.c 

OBJS += \
./tec_moviles_calcufy_AritmeticaBasica.o 

C_DEPS += \
./tec_moviles_calcufy_AritmeticaBasica.d 


# Each subdirectory must supply rules for building sources it contributes
tec_moviles_calcufy_AritmeticaBasica.o: ../tec_moviles_calcufy_AritmeticaBasica.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O3 -g3 -Wall -c -fmessage-length=0 -v -MMD -MP -MF"$(@:%.o=%.d)" -MT"tec_moviles_calcufy_AritmeticaBasica.d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


