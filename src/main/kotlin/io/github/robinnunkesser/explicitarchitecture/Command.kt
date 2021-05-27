package io.github.robinnunkesser.explicitarchitecture

/**
 *
 */
interface Command<InDTOType, OutDTOType> {

    /**
     * Executes the UseCase.
     *
     * @param inDTO encapsulated inDTO parameters.
     * @param successHandler the closure to use for a successful result.
     * @param errorHandler the closure to use for an unsuccessful result.
     */
    fun execute(
        inDTO: InDTOType, successHandler: (success: OutDTOType) -> Unit,
        errorHandler: (error: Throwable) -> Unit
    )
}

