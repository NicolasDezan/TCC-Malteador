async def send_heartbeat_task():
    while True:
        _memory_usage_A = int(memory_usage())
        _memory_usage_B = int((memory_usage()*100) % 100)
        
        message = [
            WriteList.HEARTBEAT,
            _memory_usage_A,
            _memory_usage_B
        ]
        
        bt.write_characteristic.write(bytes(message), send_update=True)
        await asyncio.sleep(1)
        send_actuators_state()
        await asyncio.sleep(1)

        classreadlist