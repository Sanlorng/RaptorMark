package io.github.devriesl.raptormark.data

class RandRwTestJNI : TestBaseJNI() {
    override fun getTestName(): String {
        return TEST_NAME
    }

    companion object {
        const val TEST_NAME = "Random Read/Write Throughput"
    }
}