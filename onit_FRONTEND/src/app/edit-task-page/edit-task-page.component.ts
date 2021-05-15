import { Component, OnInit } from '@angular/core';

interface Label {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-edit-task-page',
  templateUrl: './edit-task-page.component.html',
  styleUrls: ['./edit-task-page.component.css']
})
export class EditTaskPageComponent implements OnInit {

  labels: Label[] = [
    {value: 'label-0', viewValue: 'Label 0'},
    {value: 'label-1', viewValue: 'Label 1'},
    {value: 'label-2', viewValue: 'Label 2'},
  ];

  checked = false;
  indeterminate = false;
  labelPosition: 'before' | 'after' = 'after';
  disabled = false;
  minDate: Date;
  addLocation = false;

  lat: number;
  lng: number;
  zoomLevel: number;

  selectedMarker = null;

  marker = { lat: null, lng: null, alpha: 1 };

  moveMarker(lat: number, lng: number): void {
    console.log('moveMarker: new lat is ' + lat);
    console.log('moveMarker: new lng is ' + lng);
    this.marker.lat = lat;
    this.marker.lng = lng;
  }

  dragMarker(lat: number, lng: number): void {
    console.log('dragMarker: new lat is  ' + lat);
    console.log('dragMarker: new lng is ' + lng);
    this.marker.lat = lat;
    this.marker.lng = lng;
  }

  selectMarker(event): void {
    this.marker.lat = event.latitude;
    this.marker.lng = event.longitude;
  }

  addingLocation(): void {
    const that = this;
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition((position) => {
        that.lng = position.coords.longitude;
        that.lat = position.coords.latitude;
        that.marker.lat = that.lat;
        that.marker.lng = that.lng;
        that.zoomLevel = 10;
      }, () => {
        that.lat = 39.668;
        that.lng = -98.62;
        that.marker.lat = that.lat;
        that.marker.lng = that.lng;
        that.zoomLevel = 3.5;
      });
    }
  }
  constructor() {
    const currentYear = new Date().getFullYear();
    const currentMonth = new Date().getMonth();
    const currentDay = new Date().getDate();
    this.minDate = new Date(currentYear, currentMonth, currentDay);
  }

  ngOnInit(): void {
  }

}