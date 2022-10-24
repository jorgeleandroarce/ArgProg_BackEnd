package com.porfolioApp.Porfolio.controller;

import com.porfolioApp.Porfolio.Dto.dtoEducacion;
import com.porfolioApp.Porfolio.Dto.dtoExperiencia;
import com.porfolioApp.Porfolio.Dto.dtoPersona;
import com.porfolioApp.Porfolio.Dto.dtoProyectos;
import com.porfolioApp.Porfolio.model.Educacion;
import com.porfolioApp.Porfolio.model.Experiencia;
import com.porfolioApp.Porfolio.model.HabilidadesHard;
import com.porfolioApp.Porfolio.model.HabilidadesSoft;
import com.porfolioApp.Porfolio.model.Persona;
import com.porfolioApp.Porfolio.model.Proyectos;
import com.porfolioApp.Porfolio.model.Usuarios;
import com.porfolioApp.Porfolio.service.IEducacionService;
import com.porfolioApp.Porfolio.service.IExperienciaService;
import com.porfolioApp.Porfolio.service.IHabilidadesHardService;
import com.porfolioApp.Porfolio.service.IHabilidadesSoftService;
import com.porfolioApp.Porfolio.service.IPersonaService;
import com.porfolioApp.Porfolio.service.IProyectosService;
import com.porfolioApp.Porfolio.service.IUsuariosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
    
//////////////COMIENZA Controller Persona////////////////////
  
  @Autowired
  private IPersonaService persoServ;
  
  @GetMapping ("/persona/ver/{id}")
  @ResponseBody
  public Optional<Persona> buscarPersona(@PathVariable Long id) {
      return persoServ.buscarPersona(id);
    }
  
  @DeleteMapping ("/persona/delete/{id}")
  public void borrarPersona (@PathVariable Long id) {
      persoServ.borrarPersona(id);
    }
  
  @PutMapping ("/persona/editar/{id}")
  public void editarPersona (@PathVariable("id") Long id,
                             @RequestBody dtoPersona dtoper){
            
            Persona per = persoServ.buscarPersona(id).get();
             
             per.setImgportada(dtoper.getImgportada());
             per.setImgfoto(dtoper.getImgfoto());
             per.setNombre(dtoper.getNombre());
             per.setProfesion(dtoper.getProfesion());
             per.setDescripcion(dtoper.getDescripcion());
             per.setInstagram(dtoper.getInstagram());
             per.setTelefono(dtoper.getTelefono());
             per.setE_mail(dtoper.getE_mail());
             
             persoServ.crearPersona(per);
    }
   
//////////////COMIENZA Controller Educacion////////////////////        
    
  @Autowired
  private IEducacionService eduServ;
   
  @PostMapping ("/educacion/new")
  public void agregarEducacion (@RequestBody Educacion edu) {
      eduServ.crearEducacion(edu);
  }
  
  @GetMapping ("/educacion/ver")
  @ResponseBody
  public List<Educacion> verEducacion() {
      return eduServ.verEducacion();
  }
  
  @GetMapping ("/educacion/una/{id}")
  @ResponseBody
  public Optional<Educacion> buscarEducacion(@PathVariable Long id) {
      return eduServ.buscarEducacion(id);
    }
   
  @DeleteMapping ("/educacion/delete/{id}")
  public void borrarEducacion (@PathVariable Long id) {
      eduServ.borrarEducacion(id);
    }
  
  @PutMapping ("/educacion/editar/{id}")
  public void editarEducacion (@PathVariable("id") Long id,
                               @RequestBody dtoEducacion dtoedu){
            
            Educacion edu = eduServ.buscarEducacion(id).get();
             
             edu.setEscuela(dtoedu.getEscuela());
             edu.setLogotipo(dtoedu.getLogotipo());
             edu.setSitioweb(dtoedu.getSitioweb());
             edu.setTitulo(dtoedu.getTitulo());
             edu.setPeriodo(dtoedu.getPeriodo());
             
             eduServ.crearEducacion(edu);
    }
  
//////////////COMIENZA Controller Experiencia////////////////////
  
  @Autowired
  private IExperienciaService expServ;
  
  @PostMapping ("/experiencia/new")
  public void agregarExperiencia (@RequestBody Experiencia exp) {
      expServ.crearExperiencia(exp);
  }
  
  @GetMapping ("/experiencia/ver")
  @ResponseBody
  public List<Experiencia> verExperiencia() {
      return expServ.verExperiencia();
  }
  
  @GetMapping ("/experiencia/una/{id}")
  @ResponseBody
  public Optional<Experiencia> buscarExperiencia(@PathVariable Long id) {
      return expServ.buscarExperiencia(id);
    }
  
  @DeleteMapping ("/experiencia/delete/{id}")
  public void borrarExperiencia (@PathVariable Long id) {
      expServ.borrarExperiencia(id);
    }
  
  @PutMapping ("/experiencia/editar/{id}")
  public void editarExperiencia (@PathVariable("id") Long id,
                               @RequestBody dtoExperiencia dtoexp){
            
            Experiencia exp = expServ.buscarExperiencia(id).get();
             
             exp.setEmpresa(dtoexp.getEmpresa());
             exp.setLogoempresa(dtoexp.getLogoempresa());
             exp.setSitioweb(dtoexp.getSitioweb());
             exp.setTelefono(dtoexp.getTelefono());
             exp.setCargo(dtoexp.getCargo());
             exp.setPeriodo(dtoexp.getPeriodo());
             exp.setDescripcion(dtoexp.getDescripcion());
             
             expServ.crearExperiencia(exp);
    }
  
  //////////////COMIENZA Controller Usuarios////////////////////
  
  @Autowired
  private IUsuariosService usuServ;
  
  @GetMapping ("/usuarios/un/{id}")
  @ResponseBody
  public Optional<Usuarios> buscarUsuario(@PathVariable Long id) {
      return usuServ.buscarUsuario(id);
    }
  
  //////////////COMIENZA Controller Proyectos////////////////////
  
  @Autowired
  private IProyectosService proyServ;
  
  @PostMapping ("/proyectos/new")
  public void agregarProyectos (@RequestBody Proyectos proy) {
      proyServ.crearProyectos(proy);
  }
  
  @GetMapping ("/proyectos/ver")
  @ResponseBody
  public List<Proyectos> verProyectos() {
      return proyServ.verProyectos();
  }
  
  @GetMapping ("/proyectos/una/{id}")
  @ResponseBody
  public Optional<Proyectos> buscarProyectos(@PathVariable Long id) {
      return proyServ.buscarProyectos(id);
    }
      
  @DeleteMapping ("/proyectos/delete/{id}")
  public void borrarProyectos (@PathVariable Long id) {
      proyServ.borrarProyectos(id);
    }
  
  @PutMapping ("/proyectos/editar/{id}")
  public void editarProyectos (@PathVariable("id") Long id,
                               @RequestBody dtoProyectos dtoproy){
            
            Proyectos proy = proyServ.buscarProyectos(id).get();
             
             proy.setNombre(dtoproy.getNombre());
             proy.setLogo(dtoproy.getLogo());
             proy.setUrl(dtoproy.getUrl());
             proy.setFecha(dtoproy.getFecha());
             proy.setDescripcion(dtoproy.getDescripcion());
             
             proyServ.crearProyectos(proy);
    }
  
  //////////////COMIENZA Controller HabilidadesHard////////////////////
  
  @Autowired
  private IHabilidadesHardService habhServ;
  
  @PostMapping ("/habilidadeshard/new")
  public void agregarHabilidadesHard (@RequestBody HabilidadesHard habh) {
      habhServ.crearHabilidadesHard(habh);
  }
  
  @GetMapping ("/habilidadeshard/ver")
  @ResponseBody
  public List<HabilidadesHard> verHabilidadesHard() {
      return habhServ.verHabilidadesHard();
  }
  
  @DeleteMapping ("/habilidadeshard/delete/{id}")
  public void borrarHabilidadesHard (@PathVariable Long id) {
      habhServ.borrarHabilidadesHard(id);
    }

  //////////////COMIENZA Controller HabilidadesSoft////////////////////
  
  @Autowired
  private IHabilidadesSoftService habsServ;
  
  @PostMapping ("/habilidadessoft/new")
  public void agregarHabilidadesSoft (@RequestBody HabilidadesSoft habs) {
      habsServ.crearHabilidadesSoft(habs);
  }
  
  @GetMapping ("/habilidadessoft/ver")
  @ResponseBody
  public List<HabilidadesSoft> verHabilidadesSoft() {
      return habsServ.verHabilidadesSoft();
  }
  
  @DeleteMapping ("/habilidadessoft/delete/{id}")
  public void borrarHabilidadesSoft (@PathVariable Long id) {
      habsServ.borrarHabilidadesSoft(id);
    }
}

