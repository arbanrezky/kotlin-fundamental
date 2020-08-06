fun main(){
    val nilaiDiAtasKkm = 80
    val nilaiDiBawahKkm = 60
    val nilai: String
    nilai = if (nilaiDiBawahKkm > 60){
        "Selamat ya"
    }else if (nilaiDiBawahKkm > nilaiDiAtasKkm )
        "nilai kamu 90, selamat ya "
    else {
        "nilai kamu 68, silakan ikut remidial"
    }
    print(nilai)
}