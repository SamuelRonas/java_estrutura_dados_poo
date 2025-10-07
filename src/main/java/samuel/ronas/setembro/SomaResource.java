package samuel.ronas.setembro;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/soma")
public class SomaResource {

    public static class SomaRequest {
        public int num1;
        public int num2;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String soma(SomaRequest request) {
        int resultado = request.num1 + request.num2;
        return "Resultado: " + resultado;
    }
}
