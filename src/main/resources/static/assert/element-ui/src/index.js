/* Automatically generated by './build/bin/build-entry.js' */

import Pagination from '../../../Desktop/element-ui/packages/pagination';
import Dialog from '../../../Desktop/element-ui/packages/dialog';
import Autocomplete from '../../../Desktop/element-ui/packages/autocomplete';
import Dropdown from '../../../Desktop/element-ui/packages/dropdown';
import DropdownMenu from '../../../Desktop/element-ui/packages/dropdown-menu';
import DropdownItem from '../../../Desktop/element-ui/packages/dropdown-item';
import Menu from '../../../Desktop/element-ui/packages/menu';
import Submenu from '../../../Desktop/element-ui/packages/submenu';
import MenuItem from '../../../Desktop/element-ui/packages/menu-item';
import MenuItemGroup from '../../../Desktop/element-ui/packages/menu-item-group';
import Input from '../../../Desktop/element-ui/packages/input';
import InputNumber from '../../../Desktop/element-ui/packages/input-number';
import Radio from '../../../Desktop/element-ui/packages/radio';
import RadioGroup from '../../../Desktop/element-ui/packages/radio-group';
import RadioButton from '../../../Desktop/element-ui/packages/radio-button';
import Checkbox from '../../../Desktop/element-ui/packages/checkbox';
import CheckboxButton from '../../../Desktop/element-ui/packages/checkbox-button';
import CheckboxGroup from '../../../Desktop/element-ui/packages/checkbox-group';
import Switch from '../../../Desktop/element-ui/packages/switch';
import Select from '../../../Desktop/element-ui/packages/select';
import Option from '../../../Desktop/element-ui/packages/option';
import OptionGroup from '../../../Desktop/element-ui/packages/option-group';
import Button from '../../../Desktop/element-ui/packages/button';
import ButtonGroup from '../../../Desktop/element-ui/packages/button-group';
import Table from '../../../Desktop/element-ui/packages/table';
import TableColumn from '../../../Desktop/element-ui/packages/table-column';
import DatePicker from '../../../Desktop/element-ui/packages/date-picker';
import TimeSelect from '../../../Desktop/element-ui/packages/time-select';
import TimePicker from '../../../Desktop/element-ui/packages/time-picker';
import Popover from '../../../Desktop/element-ui/packages/popover';
import Tooltip from '../../../Desktop/element-ui/packages/tooltip';
import MessageBox from '../../../Desktop/element-ui/packages/message-box';
import Breadcrumb from '../../../Desktop/element-ui/packages/breadcrumb';
import BreadcrumbItem from '../../../Desktop/element-ui/packages/breadcrumb-item';
import Form from '../../../Desktop/element-ui/packages/form';
import FormItem from '../../../Desktop/element-ui/packages/form-item';
import Tabs from '../../../Desktop/element-ui/packages/tabs';
import TabPane from '../../../Desktop/element-ui/packages/tab-pane';
import Tag from '../../../Desktop/element-ui/packages/tag';
import Tree from '../../../Desktop/element-ui/packages/tree';
import Alert from '../../../Desktop/element-ui/packages/alert';
import Notification from '../../../Desktop/element-ui/packages/notification';
import Slider from '../../../Desktop/element-ui/packages/slider';
import Loading from '../../../Desktop/element-ui/packages/loading';
import Icon from '../../../Desktop/element-ui/packages/icon';
import Row from '../../../Desktop/element-ui/packages/row';
import Col from '../../../Desktop/element-ui/packages/col';
import Upload from '../../../Desktop/element-ui/packages/upload';
import Progress from '../../../Desktop/element-ui/packages/progress';
import Spinner from '../../../Desktop/element-ui/packages/spinner';
import Message from '../../../Desktop/element-ui/packages/message';
import Badge from '../../../Desktop/element-ui/packages/badge';
import Card from '../../../Desktop/element-ui/packages/card';
import Rate from '../../../Desktop/element-ui/packages/rate';
import Steps from '../../../Desktop/element-ui/packages/steps';
import Step from '../../../Desktop/element-ui/packages/step';
import Carousel from '../../../Desktop/element-ui/packages/carousel';
import Scrollbar from '../../../Desktop/element-ui/packages/scrollbar';
import CarouselItem from '../../../Desktop/element-ui/packages/carousel-item';
import Collapse from '../../../Desktop/element-ui/packages/collapse';
import CollapseItem from '../../../Desktop/element-ui/packages/collapse-item';
import Cascader from '../../../Desktop/element-ui/packages/cascader';
import ColorPicker from '../../../Desktop/element-ui/packages/color-picker';
import Transfer from '../../../Desktop/element-ui/packages/transfer';
import Container from '../../../Desktop/element-ui/packages/container';
import Header from '../../../Desktop/element-ui/packages/header';
import Aside from '../../../Desktop/element-ui/packages/aside';
import Main from '../../../Desktop/element-ui/packages/main';
import Footer from '../../../Desktop/element-ui/packages/footer';
import Timeline from '../../../Desktop/element-ui/packages/timeline';
import TimelineItem from '../../../Desktop/element-ui/packages/timeline-item';
import Link from '../../../Desktop/element-ui/packages/link';
import Divider from '../../../Desktop/element-ui/packages/divider';
import Image from '../../../Desktop/element-ui/packages/image';
import Calendar from '../../../Desktop/element-ui/packages/calendar';
import Backtop from '../../../Desktop/element-ui/packages/backtop';
import InfiniteScroll from '../../../Desktop/element-ui/packages/infinite-scroll';
import PageHeader from '../../../Desktop/element-ui/packages/page-header';
import CascaderPanel from '../../../Desktop/element-ui/packages/cascader-panel';
import Avatar from '../../../Desktop/element-ui/packages/avatar';
import Drawer from '../../../Desktop/element-ui/packages/drawer';
import Popconfirm from '../../../Desktop/element-ui/packages/popconfirm';
import locale from 'element-ui/src/locale';
import CollapseTransition from 'element-ui/src/transitions/collapse-transition';

const components = [
  Pagination,
  Dialog,
  Autocomplete,
  Dropdown,
  DropdownMenu,
  DropdownItem,
  Menu,
  Submenu,
  MenuItem,
  MenuItemGroup,
  Input,
  InputNumber,
  Radio,
  RadioGroup,
  RadioButton,
  Checkbox,
  CheckboxButton,
  CheckboxGroup,
  Switch,
  Select,
  Option,
  OptionGroup,
  Button,
  ButtonGroup,
  Table,
  TableColumn,
  DatePicker,
  TimeSelect,
  TimePicker,
  Popover,
  Tooltip,
  Breadcrumb,
  BreadcrumbItem,
  Form,
  FormItem,
  Tabs,
  TabPane,
  Tag,
  Tree,
  Alert,
  Slider,
  Icon,
  Row,
  Col,
  Upload,
  Progress,
  Spinner,
  Badge,
  Card,
  Rate,
  Steps,
  Step,
  Carousel,
  Scrollbar,
  CarouselItem,
  Collapse,
  CollapseItem,
  Cascader,
  ColorPicker,
  Transfer,
  Container,
  Header,
  Aside,
  Main,
  Footer,
  Timeline,
  TimelineItem,
  Link,
  Divider,
  Image,
  Calendar,
  Backtop,
  PageHeader,
  CascaderPanel,
  Avatar,
  Drawer,
  Popconfirm,
  CollapseTransition
];

const install = function(Vue, opts = {}) {
  locale.use(opts.locale);
  locale.i18n(opts.i18n);

  components.forEach(component => {
    Vue.component(component.name, component);
  });

  Vue.use(InfiniteScroll);
  Vue.use(Loading.directive);

  Vue.prototype.$ELEMENT = {
    size: opts.size || '',
    zIndex: opts.zIndex || 2000
  };

  Vue.prototype.$loading = Loading.service;
  Vue.prototype.$msgbox = MessageBox;
  Vue.prototype.$alert = MessageBox.alert;
  Vue.prototype.$confirm = MessageBox.confirm;
  Vue.prototype.$prompt = MessageBox.prompt;
  Vue.prototype.$notify = Notification;
  Vue.prototype.$message = Message;

};

/* istanbul ignore if */
if (typeof window !== 'undefined' && window.Vue) {
  install(window.Vue);
}

export default {
  version: '2.13.0',
  locale: locale.use,
  i18n: locale.i18n,
  install,
  CollapseTransition,
  Loading,
  Pagination,
  Dialog,
  Autocomplete,
  Dropdown,
  DropdownMenu,
  DropdownItem,
  Menu,
  Submenu,
  MenuItem,
  MenuItemGroup,
  Input,
  InputNumber,
  Radio,
  RadioGroup,
  RadioButton,
  Checkbox,
  CheckboxButton,
  CheckboxGroup,
  Switch,
  Select,
  Option,
  OptionGroup,
  Button,
  ButtonGroup,
  Table,
  TableColumn,
  DatePicker,
  TimeSelect,
  TimePicker,
  Popover,
  Tooltip,
  MessageBox,
  Breadcrumb,
  BreadcrumbItem,
  Form,
  FormItem,
  Tabs,
  TabPane,
  Tag,
  Tree,
  Alert,
  Notification,
  Slider,
  Icon,
  Row,
  Col,
  Upload,
  Progress,
  Spinner,
  Message,
  Badge,
  Card,
  Rate,
  Steps,
  Step,
  Carousel,
  Scrollbar,
  CarouselItem,
  Collapse,
  CollapseItem,
  Cascader,
  ColorPicker,
  Transfer,
  Container,
  Header,
  Aside,
  Main,
  Footer,
  Timeline,
  TimelineItem,
  Link,
  Divider,
  Image,
  Calendar,
  Backtop,
  InfiniteScroll,
  PageHeader,
  CascaderPanel,
  Avatar,
  Drawer,
  Popconfirm
};
