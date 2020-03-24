package com.example.examen.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Items")
data class Items(

    @field:SerializedName("TechoC2")
    val techoC2: String? = null,

    @field:SerializedName("TechoC3")
    val techoC3: String? = null,

    @field:SerializedName("TechoC4")
    val techoC4: String? = null,

    @field:SerializedName("IdCiudad")
    val idCiudad: String? = null,

    @field:SerializedName("Statussync")
    val statussync: Int? = null,

    @field:SerializedName("ComentarioFrentesEnFrio")
    val comentarioFrentesEnFrio: String? = null,

    @field:SerializedName("MatPOPCenefas")
    val matPOPCenefas: String? = null,

    @field:SerializedName("TechoC1")
    val techoC1: String? = null,

    @field:SerializedName("TramosFrentesEnFrio")
    val tramosFrentesEnFrio: String? = null,

    @field:SerializedName("FechaSync")
    val fechaSync: String? = null,

    @field:SerializedName("IsCajas")
    val isCajas: String? = null,

    @field:SerializedName("IsForway")
    val isForway: String? = null,

    @field:SerializedName("Direccion")
    val direccion: String? = null,

    @field:SerializedName("MatPOPCartulina")
    val matPOPCartulina: String? = null,

    @field:SerializedName("CajasFrentes")
    val cajasFrentes: String? = null,

    @field:SerializedName("determinante")
    val determinante: String = "",

    @field:SerializedName("IsAriete")
    val isAriete: String? = null,

    @field:SerializedName("Suelo")
    val suelo: String? = null,

    @field:SerializedName("TarimasBodega")
    val tarimasBodega: String? = null,

    @field:SerializedName("MatPOPColgantes")
    val matPOPColgantes: String? = null,

    @field:SerializedName("IsC3")
    val isC3: String? = null,

    @field:SerializedName("IsC4")
    val isC4: String? = null,

    @field:SerializedName("IsC1")
    val isC1: String? = null,

    @PrimaryKey
    @field:SerializedName("Id")
    val id: Int? = null,

    @field:SerializedName("IsC2")
    val isC2: String? = null,

    @field:SerializedName("Facturacion")
    val facturacion: String? = null,

    @field:SerializedName("TirasFrentes")
    val tirasFrentes: String? = null,

    @field:SerializedName("OjoFrentesEnFrio")
    val ojoFrentesEnFrio: String? = null,

    @field:SerializedName("Colonia")
    val colonia: String? = null,

    @field:SerializedName("IsOtro")
    val isOtro: String? = null,

    @field:SerializedName("NuevoPunto")
    val nuevoPunto: String? = null,

    @field:SerializedName("Telefonos")
    val telefonos: String? = null,

    @field:SerializedName("DeterminanteTienda")
    val determinanteTienda: String? = null,

    @field:SerializedName("Nielsen")
    val nielsen: String? = null,

    @field:SerializedName("Fecha")
    val fecha: String? = null,

    @field:SerializedName("Altitud")
    val altitud: Int? = null,

    @field:SerializedName("IsExhibidores")
    val isExhibidores: String? = null,

    @field:SerializedName("nombreComercial")
    val nombreComercial: String? = null,

    @field:SerializedName("agrupador")
    val agrupador: String? = null,

    @field:SerializedName("ManosC1")
    val manosC1: String? = null,

    @field:SerializedName("ManosC2")
    val manosC2: String? = null,

    @field:SerializedName("ManosC3")
    val manosC3: String? = null,

    @field:SerializedName("ManosC4")
    val manosC4: String? = null,

    @field:SerializedName("IslasFrentes")
    val islasFrentes: String? = null,

    @field:SerializedName("CP")
    val cP: Int? = null,

    @field:SerializedName("ComentarioAnaquel")
    val comentarioAnaquel: String? = null,

    @field:SerializedName("Sucursal")
    val sucursal: String = "",

    @field:SerializedName("CabeceraFrentes")
    val cabeceraFrentes: String? = null,

    @field:SerializedName("MatPOPStoppers")
    val matPOPStoppers: String? = null,

    @field:SerializedName("ForwayFrentes")
    val forwayFrentes: String? = null,

    @field:SerializedName("MatPOPTapete")
    val matPOPTapete: String? = null,

    @field:SerializedName("Calle")
    val calle: String? = null,

    @field:SerializedName("MatPOPOtros")
    val matPOPOtros: String? = null,

    @field:SerializedName("MatPOPDanglers")
    val matPOPDanglers: String? = null,

    @field:SerializedName("IsIsla")
    val isIsla: String? = null,

    @field:SerializedName("IsBunkers")
    val isBunkers: String? = null,

    @field:SerializedName("Numero")
    val numero: String? = null,

    @field:SerializedName("TramosAnaquel")
    val tramosAnaquel: String? = null,

    @field:SerializedName("ComentarioBodega")
    val comentarioBodega: String? = null,

    @field:SerializedName("IdGrupo")
    val idGrupo: Int? = null,

    @field:SerializedName("Bateria")
    val bateria: String? = null,

    @field:SerializedName("Latitud")
    val latitud: Double? = null,

    @field:SerializedName("MatPOPFolleto")
    val matPOPFolleto: String? = null,

    @field:SerializedName("IdPais")
    val idPais: String? = null,

    @field:SerializedName("IdCadena")
    val idCadena: Int? = null,

    @field:SerializedName("CadenaFecha")
    val cadenaFecha: String? = null,

    @field:SerializedName("ArietesFrentes")
    val arietesFrentes: String? = null,

    @field:SerializedName("IdCategoria")
    val idCategoria: Int? = null,

    @field:SerializedName("Precio")
    val precio: String? = null,

    @field:SerializedName("IsAreaFlex")
    val isAreaFlex: String? = null,

    @field:SerializedName("Activo")
    val activo: Int? = null,

    @field:SerializedName("DeterminanteGSP")
    val determinanteGSP: Int? = null,

    @field:SerializedName("OtrosFrentes")
    val otrosFrentes: String? = null,

    @field:SerializedName("Cadena")
    val cadena:  String = "",

    @field:SerializedName("MatPOPCorbata")
    val matPOPCorbata: String? = null,

    @field:SerializedName("MatPOPTira")
    val matPOPTira: String? = null,

    @field:SerializedName("OjoC2")
    val ojoC2: String? = null,

    @field:SerializedName("CantFrentesEnFrio")
    val cantFrentesEnFrio: String? = null,

    @field:SerializedName("IdCanal")
    val idCanal: Int? = null,

    @field:SerializedName("Longitud")
    val longitud: Double? = null,

    @field:SerializedName("OjoC1")
    val ojoC1: String? = null,

    @field:SerializedName("TechoFrentesEnFrio")
    val techoFrentesEnFrio: String? = null,

    @field:SerializedName("AreaFlexFrentes")
    val areaFlexFrentes: String? = null,

    @field:SerializedName("Estatus")
    val estatus: String? = null,

    @field:SerializedName("OjoC4")
    val ojoC4: String? = null,

    @field:SerializedName("OjoC3")
    val ojoC3: String? = null,

    @field:SerializedName("IdProyecto")
    val idProyecto: String? = null,

    @field:SerializedName("IdUsuario")
    val idUsuario: String? = null,

    @field:SerializedName("ManosFrentesEnFrio")
    val manosFrentesEnFrio: String? = null,

    @field:SerializedName("Techo")
    val techo: String? = null,

    @field:SerializedName("SueloC3")
    val sueloC3: String? = null,

    @field:SerializedName("SueloC4")
    val sueloC4: String? = null,

    @field:SerializedName("SueloC1")
    val sueloC1: String? = null,

    @field:SerializedName("SueloC2")
    val sueloC2: String? = null,

    @field:SerializedName("SueloFrentesEnFrio")
    val sueloFrentesEnFrio: String? = null,

    @field:SerializedName("MatPOPPreciador")
    val matPOPPreciador: String? = null,

    @field:SerializedName("IdFormato")
    val idFormato: String? = null,

    @field:SerializedName("IdVisita_Server")
    val idVisitaServer: Int? = null,

    @field:SerializedName("IsCabecera")
    val isCabecera: String? = null,

    @field:SerializedName("MatPOPFaldon")
    val matPOPFaldon: String? = null,

    @field:SerializedName("IsTiras")
    val isTiras: String? = null,

    @field:SerializedName("Ojo")
    val ojo: String? = null,

    @field:SerializedName("PrecioFrentesEnFrio")
    val precioFrentesEnFrio: String? = null,

    @field:SerializedName("IdMunicipio")
    val idMunicipio: String? = null,

    @field:SerializedName("ComentarioExhAdic")
    val comentarioExhAdic: String? = null,

    @field:SerializedName("IsMaterialPOP")
    val isMaterialPOP: String? = null,

    @field:SerializedName("MatPOPFlash")
    val matPOPFlash: String? = null,

    @field:SerializedName("CantBodega")
    val cantBodega: String? = null,

    @field:SerializedName("Ufechadescarga")
    val ufechadescarga: String? = null,

    @field:SerializedName("IdFoto")
    val idFoto: String? = null,

    @field:SerializedName("CantAnaquel")
    val cantAnaquel: String? = null,

    @field:SerializedName("IdEstado")
    val idEstado: String? = null,

    @field:SerializedName("RangoGPS")
    val rangoGPS: String? = null,

    @field:SerializedName("Manos")
    val manos: String? = null,

    @field:SerializedName("SKU")
    val sKU: String? = null

)