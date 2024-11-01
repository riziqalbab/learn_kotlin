package data

import data.data.Address

class Person(district: String, regency: String, country: String, var name: String, var old: Int): Address(district, regency, country) {
    fun sayHello(name: String){
        println("Haloo $name nama saya ${this.name}, saya tinggal di ${this.district} negara ${this.country}" )
    }
}

