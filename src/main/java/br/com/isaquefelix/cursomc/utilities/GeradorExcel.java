package br.com.isaquefelix.cursomc.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import br.com.ibm.cadeiabatch.entity.CategoriaEnum;
//import br.com.ibm.cadeiabatch.entity.ExtratoHoras;
//import br.com.ibm.cadeiabatch.entity.TipoChamadoEnum;

public class GeradorExcel {

	public FileOutputStream gerarExcel(List<?> extracao) {
		
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
	//Prepara planilha	
	//HSSFWorkbook workbook = new HSSFWorkbook();
	//HSSFSheet firstSheet = workbook.createSheet("Aba1");
	
	File file = new File("C:\\ExtracaoWorkHours");
	if(!file.exists()) {
		file.mkdir();
	}
	
	FileOutputStream fos = null;
	    
	try {		
		
		fos = new FileOutputStream(file + "\\ExtratoWorkHours.xls" );

		int i = 0;
		
		//HEADER DA PLANILHA		
		//HSSFRow row = firstSheet.createRow(i++);
		
		//row.createCell(0).setCellValue("CHAMADO");
		//row.createCell(1).setCellValue("DESCRIÇÃO");
		//row.createCell(2).setCellValue("TIPO");
		//row.createCell(3).setCellValue("CATEGORIA");
		//row.createCell(4).setCellValue("DATA");
		//row.createCell(5).setCellValue("MES");
		//row.createCell(6).setCellValue("HORAS");
		//row.createCell(7).setCellValue("NOME");
		
		/*for (ExtratoHoras extratoHoras : extracao) {
		
			//LINHAS DA PLANILHA
			row = firstSheet.createRow(i++);
			
			row.createCell(0).setCellValue(String.format(extratoHoras.getNumero().toString()));
			row.createCell(1).setCellValue(extratoHoras.getDescricao());
			row.createCell(2).setCellValue(String.format(TipoChamadoEnum.values()[extratoHoras.getTipo()].toString()));
			row.createCell(3).setCellValue(String.format(CategoriaEnum.values()[extratoHoras.getCategoria()].toString()));
			row.createCell(4).setCellValue(dateFormat.format(extratoHoras.getData()));
			row.createCell(5).setCellValue(extratoHoras.getMes());
			row.createCell(6).setCellValue(String.format(extratoHoras.getHoras().toString()).replace(".", ","));
			row.createCell(7).setCellValue(extratoHoras.getNome());
								
			
		} // fim do for
		
		workbook.write(fos);						
		*/
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Erro ao exportar arquivo");
	} finally {
		try {						
			fos.flush();
			fos.close();			
			
		} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	return fos;
	} // fim do metodo exp	
	
}

