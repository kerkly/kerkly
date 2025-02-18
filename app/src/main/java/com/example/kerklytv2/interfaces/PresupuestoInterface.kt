package com.example.kerklytv2.interfaces

import com.example.kerklytv2.modelo.serial.PresupuestoDatos
import com.example.kerklytv2.modelo.serial.PresupuestoDatosClienteNoRegistrado
import com.example.kerklytv2.modelo.serial.PresupuestourgentesDatosCliente
import com.example.kerklytv2.modelo.serial.modeloVerificarSolictud
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PresupuestoInterface {
    @GET("ConsultaPresupuestoURgenteClienteRegistrado.php")
    // fun getPost(): Call<List<presupuestok?>?>?
    open fun getPresupuestoClienteRegistrado(@Query("Telefono") Telefono: String?,
            @Query("pageNumber") pageNumber: Int,
            @Query("pageSize") pageSize: Int):
            Call<List<PresupuestourgentesDatosCliente?>?>?


    @GET("ConsultaPresupuestourgenteClienteNR.php")
    open fun getPresupuestoCliente_NO_Registrado(@Query("Telefono") Telefono: String?,):
            Call<List<PresupuestoDatosClienteNoRegistrado?>?>?

    @GET("verificarSolicitudUrgente.php")
    open fun getVerificarSolictudUrgente(@Query("Telefono") Telefono: String?,):
            Call<List<modeloVerificarSolictud?>?>?
}