package com.code

import java.io.File
import java.lang.Exception

enum class OS {
    WINDOWS, LINUX, MAC, SOLARIS
}


fun getOS(): OS? {
    val os = System.getProperty("os.name").toLowerCase()
    return when {
        os.contains("win") -> {
            OS.WINDOWS
        }
        os.contains("nix") || os.contains("nux") || os.contains("aix") -> {
            OS.LINUX
        }
        os.contains("mac") -> {
            OS.MAC
        }
        os.contains("sunos") -> {
            OS.SOLARIS
        }
        else -> null
    }
}


class JavaFix {
    companion object{
        fun getFilePath(): String {
            val workingPath = System.getProperty("user.dir")
            val os = getOS()
            val separator: String
            separator = when(os){
                OS.LINUX -> "/"
                OS.WINDOWS -> "\\"
                else -> {throw Exception("Os not detected")}
            }
            return  workingPath + separator + "packages.txt"

        }

        fun getPackages(path: String): List<String> {
            val file =  File(path).inputStream()
            val packages = mutableListOf<String>()
            file.bufferedReader().forEachLine { packages.add(it) }
            return packages.toList()
        }
    }
}