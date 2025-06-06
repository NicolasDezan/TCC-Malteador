
if (convertedData[0] == 255) {
    onPulseReceived()
    val memUseData = convertedData[1].toFloat() 
        + convertedData[2].toFloat() / 100
    updateMemoryUsage(memUseData)
}