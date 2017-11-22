package poo20172si;

import java.util.ArrayList;

import dao.IBoateDAO;
import vo.CompradorVO;

public class BoateDAOMock implements IBoateDAO {
	ArrayList<CompradorVO> listaCompradores = new ArrayList<CompradorVO>();

	@Override
	public void comprar(String cpf, String nome) throws Exception{
		CompradorVO comprador = new CompradorVO(cpf, nome);
		this.listaCompradores.add(comprador);
	}

}
