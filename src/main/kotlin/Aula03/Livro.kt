package Aula03

data class Livro(var titulo: String,
                 var numeroPaginas: Int,
                 var autor: String,
                 var editora: String,
                 var seestaAlugado: Boolean){

    //empapsulamento:

}
//              -----no Kotlin------
//class Aula02.Livro {                     para criar a class precisa finalizar com o construtor
//    var titulo: String
//    var numeroPaginas: Int
//    var autor: String
//    var editora: String
//    var seestaAlugado: Boolean
//
//    constructor(tituloInserido:String,
//                numeroPaginasInserido: Int,
//                autorInserido: String,
//                editoraInserido: String,
//                seEstaAlugadoInserido: Boolean
//                ){
//        titulo = tituloInserido
//        numeroPaginas = numeroPaginasInserido
//        autor = autorInserido
//        editora = editoraInserido
//        seestaAlugado = seEstaAlugadoInserido
//    }
//
//}

/*       -----No java: -----
*
* public class Aula02.Livro{
*   private String titulo;
*   private String autor;
*   private Int painas;
*   private String editora;
*   private bool seEstaAlugado;
*
*   public Aula02.Livro(String titulo, String autor, Int paginas, String editora){
*       titulo = titulo;
*   }
*
*   prublic String getTitulo(){
*       return tituto
*   }
*
*   public void setTitulo(String tituloInserido){
*       this.titulo = tituloInserido
*   }
*
*   public void alugar(alugar: bool){
*       seEstaAlugado = alugar;
*   }
*
* }
* */