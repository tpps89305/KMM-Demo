/**
 * Created by Dispy-Yang on 2022/5/22.
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
object Versions{
    const val ktor = "2.0.0"
    const val serialization = "1.5.21"
}
object Develop{
    object Ktor{
        const val commonCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val commonJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val commonLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val androidCore = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
        const val ios = "io.ktor:ktor-client-ios:${Versions.ktor}"
        const val commonSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    }
}