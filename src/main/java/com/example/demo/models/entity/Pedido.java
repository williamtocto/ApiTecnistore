package com.example.demo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name =  "pedido")
public class Pedido implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idPedido;

 private int idCliente;
 private double totalGeneral;

 @Column(name = "fecha")
 @Temporal(TemporalType.DATE)
 private Date fecha;

 public Long getIdPedido() {
  return idPedido;
 }

 public void setIdPedido(Long idPedido) {
  this.idPedido = idPedido;
 }

 public int getIdCliente() {
  return idCliente;
 }

 public void setIdCliente(int idCliente) {
  this.idCliente = idCliente;
 }

 public double getTotalGeneral() {
  return totalGeneral;
 }

 public void setTotalGeneral(double totalGeneral) {
  this.totalGeneral = totalGeneral;
 }

 public Date getFecha() {
  return fecha;
 }

 public void setFecha(Date fecha) {
  this.fecha = fecha;
 }
}
