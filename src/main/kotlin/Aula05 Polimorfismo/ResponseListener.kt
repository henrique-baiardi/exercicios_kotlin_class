package `Aula05 Polimorfismo`

open class ResponseListener {
    fun onSuccess(requisicao: String) {
        println("Requisicao feita com sucesso! Pode ir ao login.")
    }

    fun onError(error: Error) {
        println("Tente novamente mais tarde...")
    }
}
