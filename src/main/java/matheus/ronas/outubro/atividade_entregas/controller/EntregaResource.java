package matheus.ronas.outubro.atividade_entregas.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import matheus.ronas.outubro.atividade_entregas.dto.Entrega;
import matheus.ronas.outubro.atividade_entregas.service.EntregaService;

@Path("/entregas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EntregaResource {

    @Inject
    EntregaService entregaService;

    // @GET
    // @Path("/pendentes")
    // public List<Entrega> listarPendentes() {
    //     return entregaService.listarPendentes();
    // }

    // @GET
    // @Path("/valorTotal")
    // public double calcularValorTotal() {
    //     return entregaService.calcularValorTotal();
    // }

    // @GET
    // @Path("/pesadas")
    // public List<Entrega> listarPesadas() {
    //     return entregaService.listarPesadas();
    // }

    // @GET
    // @Path("/buscar/{destino}")
    // public List<Entrega> buscarPorDestino(@PathParam("destino") String destino) {
    //     return entregaService.buscarPorDestino(destino);
    // }
}
