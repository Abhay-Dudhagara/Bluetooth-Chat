package com.np.bluetoothcompose.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.np.bluetoothcompose.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}