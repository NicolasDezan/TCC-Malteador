onReadUpdate = { data ->
    val convertedData = convertBytesESPToIntKotlin(data)

    if (convertedData[0] == 1) {
        println("Change Parameters: $convertedData")
        _parametersReceived.value = ParametersMapper
            .receiveParameters(convertedData)
        sharedRepository.updateParameters(_parametersReceived.value)
    }

    if (convertedData[0] == 255) {
        onPulseReceived()
        val memUseData = convertedData[1].toFloat() 
            + convertedData[2].toFloat() / 100
        updateMemoryUsage(memUseData)
    }

    if (convertedData[0] == 2) {

        val humidity = convertedData[1].toFloat() 
            + convertedData[2].toFloat() / 100
        val temperature = convertedData[3].toFloat() 
            + convertedData[4].toFloat() / 100

        val eco2 = (convertedData[5] * 10000) + (convertedData[6] * 100) 
            + convertedData[7]

        val sensorData = SensorReadData(
            humidity = humidity,
            temperature = temperature,
            eco2 = eco2
        )

        updateSensorRead(sensorData)
    }

    if (convertedData[0] == 3) {

        val actuatorState = ActuatorState(
            entrada = convertedData[1] == 1,
            saida = convertedData[2] == 1,
            rotacao = convertedData[3] == 1,
            resistencia = convertedData[4] == 1,
            bombaAr = convertedData[5] == 1
        )

        updateActuatorState(actuatorState)
    }
}