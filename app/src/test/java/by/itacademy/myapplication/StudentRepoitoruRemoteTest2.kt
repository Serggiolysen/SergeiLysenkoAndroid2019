// package by.itacademy.myapplication
//
// import by.itacademy.pvtjune.cw.cw12.Student
// import by.itacademy.pvtjune.cw.cw12.StudentApi
// import by.itacademy.pvtjune.cw.cw12.StudentRepoitoruRemote
// import org.junit.Assert
// import org.junit.Test
// import org.mockito.Matchers
// import org.mockito.Mock
// import org.mockito.Mockito
// import org.mockito.MockitoAnnotations
// import retrofit2.Response
//
// class StudentReposiroryRemoteTest2 {
//
//
//    @Mock
//    lateinit var api: StudentApi
//
//    init {
//        MockitoAnnotations.initMocks(this)
//
//    }
//
//    @Test
//    fun callGetRequest() {
//
//        Mockito.`when`(api.getStudents(Matchers.any(), Matchers.any()))
//            .thenReturn(object : MockCall<List<Student>>() {
//                override fun execute(): Response<List<Student>> {
//                    return Response.success(emptyList())
//
//                }
//            })
//
//        val repository = StudentRepoitoruRemote(api)
//
//        val studentList = repository.get(20, 0)
//
//        println(studentList.toString())
//
// //        Assert.assertTrue(studentList.size == 0)
//    }
//
// }