package io.github.italbytz.ports.common

interface Command<InDTOType, OutDTOType> {

    /**
     * Executes the UseCase asynchronously.
     *
     * @param inDTO encapsulated inDTO parameters.
     * @return A return value of type OutDTOType.
     */
    suspend fun execute(inDTO: InDTOType) : OutDTOType
}

